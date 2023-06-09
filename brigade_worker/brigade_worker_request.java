package  brigade_worker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class brigade_worker_request {
    public List<brigade_worker_model> getAllBrigadeWorker() throws SQLException {
        List<brigade_worker_model>  BrigadeWorker = new ArrayList<>();
        
        List<brigade_worker> BrigadeWorkerList = new brigade_worker_DAO().getAllBrigadeWorkers();

        for (brigade_worker  BrigadeWorkers :  BrigadeWorkerList) {
            brigade_worker_model  BrigadeWorkerModel = new brigade_worker_model(
                BrigadeWorkers.getId(),
                BrigadeWorkers.getName(),
                BrigadeWorkers.getSurename(),
                BrigadeWorkers.getAge(),
                BrigadeWorkers.getDepartment(),
                BrigadeWorkers.getSalary()
            );

            BrigadeWorker.add(BrigadeWorkerModel);
        }

        return  BrigadeWorker;
    }
}
