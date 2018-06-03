package n26.nicolas.service;

import n26.nicolas.model.Statistic;
import n26.nicolas.model.Transaction;


public interface TransactionService {

	Long saveTransaction(Transaction transaction) throws Exception;;

	Statistic getStatistics(Long seconds) throws Exception;;
}
