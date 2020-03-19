package work.temp;

import java.sql.Blob;

public class testpojo {
	public int id;
	public String name;
	public Blob doc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Blob getDoc() {
		return doc;
	}
	public void setDoc(Blob doc) {
		this.doc = doc;
	}
	@Override
	public String toString() {
		return "testpojo [id=" + id + ", name=" + name + ", doc=" + doc + "]";
	}
	public testpojo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
