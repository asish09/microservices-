//package com.example.departmentservice;
//
//import com.example.departmentservice.Dto.DepartmentDto;
//import com.example.departmentservice.entity.Department;
//import com.example.departmentservice.repository.DepartmentRepository;
//import com.example.departmentservice.service.impl.DepartmentServiceImpl;
//
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//public class DepartmentServiceImplTest {
//
//    @Mock
//    private DepartmentRepository departmentRepository;
//
//    @InjectMocks
//    private DepartmentServiceImpl departmentService;
//
//    @Test
//    public void testSaveDepartment() {
//        // Arrange
//        DepartmentDto departmentDto = new DepartmentDto(null, "TestDept", "TestDescription", "TEST123");
//        Department savedDepartment = new Department(1L, "TestDept", "TestDescription", "TEST123");
//
//        when(departmentRepository.save(any(Department.class))).thenReturn(savedDepartment);
//
//        // Act
//        DepartmentDto result = departmentService.saveDepartment(departmentDto);
//
//        // Assert
//        assertEquals(savedDepartment.getId(), result.getId());
//        assertEquals(savedDepartment.getDepartmentName(), result.getDepartmentName());
//        assertEquals(savedDepartment.getDepartmentDescription(), result.getDepartmentDescription());
//        assertEquals(savedDepartment.getDepartmentCode(), result.getDepartmentCode());
//
//        // Verify that the save method was called once
//        verify(departmentRepository, times(1)).save(any(Department.class));
//    }
//
//    @Test
//    public void testGetDepartmentByCode() {
//        // Arrange
//        String testCode = "TEST123";
//        Department department = new Department(1L, "TestDept", "TestDescription", testCode);
//
//        when(departmentRepository.findByDepartmentCode(testCode)).thenReturn(department);
//
//        // Act
//        DepartmentDto result = departmentService.getDepartmentByCode(testCode);
//
//        // Assert
//        assertEquals(department.getId(), result.getId());
//        assertEquals(department.getDepartmentName(), result.getDepartmentName());
//        assertEquals(department.getDepartmentDescription(), result.getDepartmentDescription());
//        assertEquals(department.getDepartmentCode(), result.getDepartmentCode());
//
//        // Verify that the findByDepartmentCode method was called once
//        verify(departmentRepository, times(1)).findByDepartmentCode(testCode);
//    }
//}