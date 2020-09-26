package n26.nicolas.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import n26.nicolas.constant.Constant;
import n26.nicolas.model.Statistic;
import n26.nicolas.model.Transaction;
import n26.nicolas.service.TransactionService;

@RestController
@EnableAutoConfiguration
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="/transactions",method=RequestMethod.POST)
    String transactions(@RequestBody Transaction trans,HttpServletResponse response) throws Exception{
		
		Long timeSpent = transactionService.saveTransaction(trans);
		
		if(timeSpent <= Constant.Sixty_Seconds_In_Millis){
			response.setStatus(HttpStatus.CREATED.value());
		}else{
			response.setStatus(HttpStatus.NO_CONTENT.value());
		}

		CloseableHttpClient client = HttpClients.createDefault();
		
        return null;
    }
	
	@RequestMapping(value="/statistics",method=RequestMethod.GET)
	Statistic statistics() throws Exception{
		
        return transactionService.getStatistics(60L);
    }
	

}
