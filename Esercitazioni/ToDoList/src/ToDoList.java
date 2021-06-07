
public class ToDoList {
	private Task [] toDo;
	
	public ToDoList(int numero) {
		if (numero<=0)
			numero=5;
		toDo = new Task[numero];
	};
	
	public int getDurataTaskGiorno(int data) {
		int totale = 0;
		for(Task pivot : toDo) {
			if (pivot != null)
				if (pivot.getData() == data)
					totale+=pivot.getDurata();
		};
		return totale;
	};
	
	public int getPosizioneTask(Task task) {
		if (task == null)
			return -1;
		for(int i=0; i<toDo.length; i++) {
			if (toDo[i] != null)
				if (toDo[i].equals(task))
					return i;
		};
		return -1;
	};
	
	public boolean aggiungiTask(Task task) {
		if (task == null)
			return false;
		if (getPosizioneTask(task) != -1)
			return false;
		if ((getDurataTaskGiorno(task.getData()) + task.getDurata()) >8)
			return false;
		for(int i=0; i<toDo.length; i++)
			if (toDo[i] == null) {
				toDo[i] = task;
				return true;
			};
		return false;
	};
	
	public boolean aggiungiTask(String titolo, int durata) {
		return aggiungiTask(new Task(titolo,durata));
	};
	
	public boolean rimuoviTask(Task task) {
		int index = getPosizioneTask(task);
		if (index != -1) {
			toDo[index] = null;
			return true;
		};
		return false;
	};
	
}
