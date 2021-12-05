import React from 'react';
class DiagnosisComponent extends React.Component{
	constructor(props){
		super(props);
        this.state = { schedule:[]};
		this.state={symptom_id:'',age:'',gender:''}
	    this.handleChange = this.handleChange.bind(this)
	    this.handleSubmit = this.handleSubmit.bind(this)	
	}
	handleSubmit(event){
        const { symptom_id, age,gender} = this.state
        event.preventDefault()
        alert(  `
        ____Diagnosis Details for Patient____\n
        Symptom ID : ${symptom_id}
        Age : ${age}
        Gender : ${gender}
        
        `)
    }
    
	handleChange=event=>{
  	   this.setState({
          [event.target.name] : event.target.value
  		})
  	}

	render(){
			const {diagnosis}=this.state
            const getSchedule = () => {
                let newSchedule = [];
                newSchedule.push(
                    <div className = "row">
                    <table className = "table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Issue Id</th>
                                <th>Issue Name</th>
                                <th>Accuracy</th>
                                <th>IcdName</th>
                                <th>ProfName</th>
                                <th>Ranking</th>
                                <th>Specialization Name</th>
                                <th>Specialization ID</th>
                            </tr>
        
                        </thead>
                        <tbody>
                            {/* {schedule.map(render_schedule)}  */}
        
                        </tbody>
                    </table>
                </div>
                    );
                this.setState({schedule:newSchedule});
             }
		return(
			<div>
					<h1 align="center"><u>Diagnosis Form</u></h1>
				<form onSubmit={this.handleSubmit}>
					<div>
						<label>Symptom ID:</label>
						<input name="symptom_id" onChange={this.handleChange} defaultValue={this.state.symptom_id}/>
					</div>
                    <div>
                    <label>Age:</label>
                    <input name="age" onChange={this.handleChange} defaultValue={this.state.age}/>
                </div>
						<div>
              			<label>Gender:</label>
              				<input type='radio'
              				       name='gender'
              				       value='male' 
              				       checked={this.state.gender['gender']==="male"?true:false}
              				        onChange={this.handleChange}/>
              				       <label>Male</label>
              				<input type='radio'
              				       name='gender'
              				       value='female' 
              				       checked={this.state.gender['gender']==="female"?true:false}
              				       onChange={this.handleChange}/>
              				       <label>Female</label>

              			   </div>
						
                             <button onClick={()=>getSchedule()}>Click</button>
                             <div>{this.state.schedule}</div>
						
				</form>
			</div>
		)
	}
}

export default DiagnosisComponent;