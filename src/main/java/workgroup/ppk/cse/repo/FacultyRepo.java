/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package workgroup.ppk.cse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import workgroup.ppk.cse.model.Faculty;

/**
 *
 * @author WE ARE ANONYMOUS
 */

@Repository
// Type of class or Type of entity and Primary key Type  JpaRepository<Event, String>
public interface FacultyRepo extends JpaRepository<Faculty, String> {
    
}
