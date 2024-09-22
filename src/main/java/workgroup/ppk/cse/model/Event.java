/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workgroup.ppk.cse.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author WE ARE ANONYMOUS
 */

@Entity // To create a table in database because JPA needs entity.
@Data // Invoking Lombok
@AllArgsConstructor // Creates constructors for all arguments
@NoArgsConstructor // Create constructor with no arguments
public class Event {
    
    @Id // id is primary key in table.
    private String category;
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date endDate;
    private int firstYearPartecipents;
    private int secondYearPartecipents;
    private int thirdYearPartecipents;
    private int fourthYearPartecipents;
    private int firstYearWinners;
    private int secondYearWinners;
    private int thirdYearWinners;
    private int fourthYearWinners;
    
    
}
