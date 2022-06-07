package model;

public class Task {

	private int id;
	private int duration;
	private int dpendenteTaskId;

	public Task() {
		super();
	}

	public Task(int id, int duration, int dpendenteTaskId) {
		super();
		this.id = id;
		this.duration = duration;
		this.dpendenteTaskId = dpendenteTaskId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDpendenteTaskId() {
		return dpendenteTaskId;
	}

	public void setDpendenteTaskId(int dpendenteTaskId) {
		this.dpendenteTaskId = dpendenteTaskId;
	}

}
