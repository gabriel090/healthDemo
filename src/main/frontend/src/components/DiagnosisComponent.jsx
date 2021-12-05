import React from 'react';
import Repository from '../repo/Repository';
class DiagnosisComponent extends React.Component{
	constructor(props){
		super(props);
        //this.state = { diagnosis:{symptom_id:'',gender:'',age:''}};
		this.state={diagnosis:[]}
	    this.handleChange = this.handleChange.bind(this)
	    this.handleSubmit = this.handleSubmit.bind(this)	
	}
    loadDiagnosis = (symptom_id,gender,age) => {
        Repository.fetchDiagnosis(symptom_id,gender,age)
            .then((data) => {
                this.setState({
                    diagnosis: data.data
                })
            })
    }
    componentDidMount(){
        this.loadDiagnosis()
        // SymptomsService.getSymptoms().then((res) =>{
        //     this.setState({symptoms: res.data})
           
        // })
    }

	handleSubmit(event){
        const { symptom_id, age,gender} = this.state
        event.preventDefault()
        alert(  `
        ____Diagnosis Details for Patient____\n
        Symptom ID : ${symptom_id}
        Gender : ${gender}
        Age : ${age}
      
        
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
                                <th>IcdName</th>
                                <th>ProfName</th>
                                <th>Ranking</th>
                                <th>Specialization Name</th>
                                <th>Specialization ID</th>
                            </tr>
        
                        </thead>
                        <tbody>
                        {
                           
                            this.state.diagnosis.map(
                                diagnosis => 
                                <tr key = {diagnosis.Issue.ID}>
                                    <td>{diagnosis.Issue.ID}</td>
                                    <td>{diagnosis.Issue.Name}</td>
                                    <td>{diagnosis.Issue.Accuracy}</td>
                                    <td>{diagnosis.Issue.Icd}</td>
                                    <td>{diagnosis.Issue.IcdName}</td>
                                    <td>{diagnosis.Issue.ProfName}</td>
                                    <td>{diagnosis.Issue.Ranking}</td>
                                    <td>{diagnosis.Specialisation.Name}</td>
                                    <td>{diagnosis.Specialisation.ID}</td>
                                </tr>
                            )
                        }
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
                          <div></div>
                          <input type="radio"
                           name="gender"
                           value='male' 
                          
                           onChange={this.handleChange}>
                           {this.props.myValue}
                           </input><label>Male</label>
                          <div></div>
                          <input type="radio"
                           name="gender"
                           value='Female' 
                           onChange={this.handleChange}>
                           {this.props.myValue}
                           </input><label>Female</label>
                          
              			   </div>
						
                             <button onClick={()=>getSchedule()}>Click</button>
                             <div>{this.state.schedule}</div>
						
				</form>
			</div>
		)
	}
}

export default DiagnosisComponent;