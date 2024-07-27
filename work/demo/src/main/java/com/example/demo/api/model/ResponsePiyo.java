package com.example.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ResponsePiyo
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-27T00:47:25.420785308Z[Etc/UTC]")


public class ResponsePiyo   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("greeting")
  private String greeting = null;

  public ResponsePiyo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 画面名
   * @return name
   **/
  @Schema(required = true, description = "画面名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponsePiyo greeting(String greeting) {
    this.greeting = greeting;
    return this;
  }

  /**
   * あいさつ
   * @return greeting
   **/
  @Schema(required = true, description = "あいさつ")
      @NotNull

    public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePiyo responsePiyo = (ResponsePiyo) o;
    return Objects.equals(this.name, responsePiyo.name) &&
        Objects.equals(this.greeting, responsePiyo.greeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, greeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePiyo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
