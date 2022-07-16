package ua.kiev.prog.case2;

import ua.kiev.prog.shared.Client;
import ua.kiev.prog.shared.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            // remove this
            try {
                try (Statement st = conn.createStatement()) {
                    //st.execute("DROP TABLE IF EXISTS Clients"); // +++++++++++++++++
                    //st.execute("CREATE TABLE Clients (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20) NOT NULL, age INT)");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            ClientDAOImpl2 dao = new ClientDAOImpl2(conn, "Clients");

          //  dao.createTable(Client.class);

            Client c = new Client("test", 1);
            dao.add(c);
            int id = c.getId();
            System.out.println("id of new Client is " + id);

            List<Client> list = dao.getAll(Client.class);
            System.out.println("Method getAll(Client.class)");

            printArray(list);


            list.get(0).setAge(55);
            dao.update(list.get(0));
            dao.delete(list.get(0));

            System.out.println("==========================================");

            list = dao.getAll(Client.class, "name", "age");
            System.out.println("Method getAll(Client.class, \"name\", \"age\")");
            printArray(list);
            list = dao.getAll(Client.class, "age");
            System.out.println("Method getAll(Client.class,  \"age\")");
            printArray(list);
            list = dao.getAll(Client.class, "name");
            System.out.println("Method getAll(Client.class, \"name\")");

            printArray(list);


        }
    }

    public static void printArray(List<Client> array) {
        for (Client cli : array) {
            System.out.println(cli);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
