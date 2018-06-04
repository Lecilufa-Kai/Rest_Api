package n26.nicolas.service.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import n26.nicolas.dao.TransactionDao;
import n26.nicolas.model.Statistic;
import n26.nicolas.model.Transaction;
import n26.nicolas.service.TransactionService;


@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionDao transactionDao;
	
	@Transactional
	@Override
	public  Long saveTransaction(Transaction transaction) throws Exception{
		
		Long start = System.currentTimeMillis();
		
		synchronized(this){
			
			Long currentTimestamp = System.currentTimeMillis();
			
			transaction.setTimestamp(currentTimestamp);
			
			transactionDao.saveTransaction(transaction);
		}
		
		Long end = System.currentTimeMillis();
		
		return start - end;
	}

	@Transactional(readOnly=true)
	@Override
	public Statistic getStatistics(Long seconds) throws Exception{
		
		Map<String,Object> query = new HashMap<>();
		Long now = System.currentTimeMillis();
		Long past = now - seconds*1000;
		
		query.put("now", now);
		query.put("past", past);
		
		Statistic statistic = transactionDao.getStatistics(query);
				
		return statistic;
	}

}
