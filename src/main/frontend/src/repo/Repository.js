import axios from '../services/axios';

const Repository = {
    fetchSymptoms: () => {
        return axios.get("/home");
    },
 
   
};

export default Repository;