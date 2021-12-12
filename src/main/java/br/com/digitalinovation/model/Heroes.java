package br.com.digitalinovation.model;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@Data
@NoArgsConstructor
@DynamoDBTable(tableName="Heroes_Api_Table")
public class Heroes {
	
	@Id
	@DynamoDBHashKey(attributeName="id")
	private String Id;
	
	@DynamoDBAttribute(attributeName="name")
	private String name;
	
	@DynamoDBAttribute(attributeName="universe")
	private String universe;
	
	@DynamoDbAttribute(attributeName="films")
	private int films;

	public Herois(String id, String name, String universe, int films) {
		super();
		Id = id;
		this.name = name;
		this.universe = universe;
		this.films = films;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniverse() {
		return universe;
	}

	public void setUniverse(String universe) {
		this.universe = universe;
	}

	public int getFilms() {
		return films;
	}

	public void setFilms(int films) {
		this.films = films;
	}
	
	
}
