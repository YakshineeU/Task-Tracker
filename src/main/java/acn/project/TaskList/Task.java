package acn.project.TaskList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.opencsv.bean.CsvBindByName;


import javax.persistence.Column;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="task")
public class Task {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "taskId")
	@CsvBindByName
    private Long taskId;

	@NotNull(message = "Please enter the task name.")
    @Size(min=2, max=30)
   	@Column(name = "taskName")
	@CsvBindByName
	private String taskName;

	@NotNull
	@Size(min=2, max=30)
	@Column(name = "technologyUsed")
	@CsvBindByName
    private String technologyUsed;
    
	@NotNull
	@Size(min=2, max=50)
	@Column(name = "description")
	@CsvBindByName
    private String description;

	@NotNull
	@Size(min=2, max=15)
	@Column(name = "startDate")
	@CsvBindByName
    private String startDate;
    
	@NotNull
	@Size(min=2, max=15)
	@Column(name = "completionDate")
	@CsvBindByName
    private String completionDate;

	@NotNull
	@Size(min=2, max=20)
	@Column(name = "status")
	@CsvBindByName
    private String status;
    
	@NotNull
	@Size(min=2, max=50)
	@Column(name = "review")
	@CsvBindByName
    private String review;

	@NotNull
	@Size(min=2, max=50)
	@Column(name = "remarks")
	@CsvBindByName
    private String remarks;

    //taskID
	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId= taskId;
	}

	//taskName
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	//technologyUsed
	public String getTechnologyUsed() {
		return technologyUsed;
	}

	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}
	
	//description
	public String getDescription() {
		return description;
		}

	public void setDescription(String description) {
		this.description = description;
		}
	
	//SartDate
	public String getStartDate() {
		return startDate;
		}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		}
	
	//CompletionDate
	public String getCompletionDate() {
		return completionDate;
		}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
		}
	
	//Status
	public String getStatus() {
		return status;
		}

	public void setStatus(String status) {
		this.status = status;
		}
	//Review
	public String getReview() {
		return review;
		}

	public void setReview(String review) {
		this.review = review;
		}
	//Remarks
	public String getRemarks() {
		return remarks;
		}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
		}
	
	public Task()
	{};
	

}
