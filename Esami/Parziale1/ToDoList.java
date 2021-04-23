
public class ToDoList {
	private Task[] toDo;
	
	public ToDoList(int numTasks) {
		if(numTasks <= 0)
			numTasks = 5;
		toDo = new Task[numTasks];
	}
	public int getDurataTaskGiorno(int data) {
		int durataGiorno = 0;
		for(int i = 0; i < toDo.length; i++) {
			if(toDo[i] != null)
				if(toDo[i].getData() == data)
					durataGiorno += toDo[i].getDurata();
		}
		return durataGiorno;
	}
	
	public int getPosizioneTask(Task task) {
		for (int i = 0; i < toDo.length; i++) {
			if(toDo[i] != null)
				if(toDo[i].equals(task))
					return i;
		}
		return -1;
	}
	
	public boolean aggiungiTask(Task task) {
		if(task == null)
			return false;
		if(getDurataTaskGiorno(task.getData())+task.getDurata() > 8)
			return false;
		for (int i = 0; i < toDo.length; i++) {
			if(toDo[i] != null)
				if(toDo[i].equals(task))
					return false;
			}
		for (int i = 0; i < toDo.length; i++) {
			if(toDo[i] == null) {
				toDo[i] = task;
				return true;
			}
		}
		return false;
	}
	
	public boolean aggiungiTask(String titolo, int durata) {
		return aggiungiTask(new Task(titolo, durata));
	}
	
	public boolean rimuoviTask(Task task) {
		if(task == null)
			return false;
		for (int i = 0; i < toDo.length; i++) {
			if(toDo[i] != null)
				if(toDo[i].equals(task)) {
					toDo[i] = null;
					return true;
				}
			}
		return false;
	}
	
}
