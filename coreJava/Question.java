package coreJava;

public abstract class Question {
	private int id;
	private String title;

	private String[] options;

	// public Question() {
	// }

	public Question(int id, String title, String[] options) {
		super();
		this.id = id;
		this.title = title;
		this.options = options;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public abstract boolean check(String[] anwsers) ;

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(id).append(".").append(title).append("\n");
		for (String v : options) {
			s.append(v).append("\n");
		}
		return s.toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
