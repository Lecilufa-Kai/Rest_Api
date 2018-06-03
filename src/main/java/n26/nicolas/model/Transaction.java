package n26.nicolas.model;

public class Transaction {

	private Long id;
	private Double amount;
	private Long timestamp;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
