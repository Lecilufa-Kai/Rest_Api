package n26.nicolas.dao;

import java.util.Map;

import n26.nicolas.model.Statistic;
import n26.nicolas.model.Transaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionDao {

    Long saveTransaction(Transaction transaction) throws Exception;

    Statistic getStatistics(Map<String, Object> query) throws Exception;
}
