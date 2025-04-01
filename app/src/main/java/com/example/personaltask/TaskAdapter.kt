package com.example.personaltask
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(
    private var tasks: List<Task>,
    private val ontaskcompleted: (Task) ->Unit,
    private val ontaskdeleted: (Task) ->Unit
) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
        val Taskcheckbox: CheckBox= itemview.findViewById(R.id.checkBox)
        val Tasktitle: TextView= itemview.findViewById(R.id.Textbox)
        val Taskimage: ImageButton= itemview.findViewById(R.id.imageButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskAdapter.TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent,false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskAdapter.TaskViewHolder, position: Int) {
        val task= tasks[position]
        holder.Tasktitle.text= task.title
        holder.Taskcheckbox.isChecked= task.checklist
        if (task.checklist) {
            holder.Tasktitle.paintFlags = holder.Tasktitle.paintFlags or android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            holder.Tasktitle.paintFlags = holder.Tasktitle.paintFlags and android.graphics.Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        holder.Taskcheckbox.setOnClickListener{
            task.checklist =!task.checklist
            ontaskcompleted(task)

        }
        holder.Taskimage.setOnClickListener{
            ontaskdeleted(task)
        }
    }

    override fun getItemCount(): Int {
        return tasks.size
    }
    fun updateTasks(newTasks: List<Task>) {
        tasks = newTasks
        notifyDataSetChanged()
    }

}