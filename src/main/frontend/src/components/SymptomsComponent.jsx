import React, { Component } from 'react';
import Repository from '../repo/Repository';

class SymptomsComponent extends Component {
/*
 Page gets response from symptoms api and displays it in data table
 */
    constructor(props) {
        super(props)

        this.state = {
            symptoms: []
        }
       
    }
    loadSymptoms = () => {
        Repository.fetchSymptoms()
            .then((data) => {
                this.setState({
                    symptoms: data.data
                })
            });
    }

    componentDidMount(){
        this.loadSymptoms()
        // SymptomsService.getSymptoms().then((res) =>{
        //     this.setState({symptoms: res.data})
        //     console.log('I was triggered during componentDidMount '+res.data)
        // })
    }
    render() {
        return (
            <div>
            <h2 className="text-center">Symptoms List</h2>
               
                <div className = "row">
                    <table className = "table table-striped table-bordered">
                    <thead>
                      <tr>
                            <th>ID</th>
                            <th>Symptoms</th>
                         </tr>
                    </thead>
                       <tbody>
                            {
                                this.state.symptoms.map(
                                    symptoms => 
                                    <tr key = {symptoms.ID}>
                                        <td>{symptoms.ID}</td>
                                        <td>{symptoms.Name}</td>
                                    </tr>
                                )
                            }
                       </tbody>
                    </table>
                </div>


            </div>
        );
    }
}

export default SymptomsComponent