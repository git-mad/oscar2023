import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todolisttutorial.TaskItem
import java.time.LocalTime
import java.util.UUID

class TaskViewModel : ViewModel() {
    val taskItems = MutableLiveData<MutableList<TaskItem>>()
    val name = MutableLiveData<String>() // LiveData for task name
    val desc = MutableLiveData<String>() // LiveData for task description

    init {
        taskItems.value = mutableListOf()
    }

    fun addTaskItem(newTask: TaskItem) {
        val list = taskItems.value
        list?.add(newTask)
        taskItems.postValue(list)

        // Update the name and desc LiveData when adding a new task
        name.value = newTask.name
        desc.value = newTask.desc
    }

    fun updateTaskItem(id: UUID, name: String, desc: String, dueTime: LocalTime?) {
        val list = taskItems.value

        // Implement your logic to update the task here

        // Update the name and desc LiveData if necessary
        this.name.value = name
        this.desc.value = desc
    }
}
