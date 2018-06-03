package n26.nicolas.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import n26.nicolas.model.Statistic;
import n26.nicolas.model.Transaction;

@Mapper
public interface TransactionDao {

	Long saveTransaction(Transaction transaction) throws Exception;

	Statistic getStatistics(Map<String, Object> query)throws Exception;
}
