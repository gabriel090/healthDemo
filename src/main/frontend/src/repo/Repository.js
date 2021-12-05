import axios from '../services/axios';

const Repository = {
  //Fetch api request from Spring java backend
    fetchSymptoms: () => {
        return axios.get("/home");
    },
  
    fetchDiagnosis: (symptoms,gender,age) => {
        return axios.get("/diag${symptoms}+${gender}+${age}")
    },


   
};
 
export default Repository;