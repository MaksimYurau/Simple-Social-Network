package by.maksim.springsocialnetwork.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;

    @NotBlank(message = "Username is required")
    @NotEmpty(message = "Username is required")
    @NotNull(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    @NotEmpty(message = "Password is required")
    @NotNull(message = "Password is required")
    private String password;

    @Email
    @NotBlank(message = "Email is required")
    @NotEmpty(message = "Email is required")
    @NotNull(message = "Email is required")
    private String email;

    private boolean enabled;
}
