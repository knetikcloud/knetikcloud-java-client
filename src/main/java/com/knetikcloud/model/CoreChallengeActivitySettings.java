/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CoreChallengeActivitySettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:47:37.134-04:00")
public class CoreChallengeActivitySettings {
  @JsonProperty("boot_in_play")
  private Boolean bootInPlay = null;

  @JsonProperty("custom_launch_address")
  private String customLaunchAddress = null;

  @JsonProperty("custom_launch_address_allowed")
  private Boolean customLaunchAddressAllowed = null;

  /**
   * Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Null to inherit
   */
  public enum HostOptionEnum {
    ADMIN_ONLY("admin_only"),
    
    PLAYER("player"),
    
    NON_PLAYER("non_player");

    private String value;

    HostOptionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HostOptionEnum fromValue(String text) {
      for (HostOptionEnum b : HostOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("host_option")
  private HostOptionEnum hostOption = null;

  @JsonProperty("host_status_control")
  private Boolean hostStatusControl = null;

  @JsonProperty("join_in_play")
  private Boolean joinInPlay = null;

  @JsonProperty("leave_in_play")
  private Boolean leaveInPlay = null;

  @JsonProperty("max_players")
  private Integer maxPlayers = null;

  @JsonProperty("min_players")
  private Integer minPlayers = null;

  /**
   * Restriction for who is able to report game end and results. Admin is always able to send results as well. Null to inherit from activity
   */
  public enum ResultsTrustEnum {
    NONE("none"),
    
    HOST("host"),
    
    ALL("all");

    private String value;

    ResultsTrustEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultsTrustEnum fromValue(String text) {
      for (ResultsTrustEnum b : ResultsTrustEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("results_trust")
  private ResultsTrustEnum resultsTrust = null;

  public CoreChallengeActivitySettings bootInPlay(Boolean bootInPlay) {
    this.bootInPlay = bootInPlay;
    return this;
  }

   /**
   * Whether the host can boot a user while the status is PLAYING. Null to inherit from activity
   * @return bootInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether the host can boot a user while the status is PLAYING. Null to inherit from activity")
  public Boolean isBootInPlay() {
    return bootInPlay;
  }

  public void setBootInPlay(Boolean bootInPlay) {
    this.bootInPlay = bootInPlay;
  }

  public CoreChallengeActivitySettings customLaunchAddress(String customLaunchAddress) {
    this.customLaunchAddress = customLaunchAddress;
    return this;
  }

   /**
   * A custom address (url, ip or whatever is needed in your game) that users should connect to to play in this challenge rather than the usual game server. Max length: 255
   * @return customLaunchAddress
  **/
  @ApiModelProperty(value = "A custom address (url, ip or whatever is needed in your game) that users should connect to to play in this challenge rather than the usual game server. Max length: 255")
  public String getCustomLaunchAddress() {
    return customLaunchAddress;
  }

  public void setCustomLaunchAddress(String customLaunchAddress) {
    this.customLaunchAddress = customLaunchAddress;
  }

  public CoreChallengeActivitySettings customLaunchAddressAllowed(Boolean customLaunchAddressAllowed) {
    this.customLaunchAddressAllowed = customLaunchAddressAllowed;
    return this;
  }

   /**
   * Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Will override the challenge&#39;s custom_launch_address if they do. Null to inherit from activity
   * @return customLaunchAddressAllowed
  **/
  @ApiModelProperty(example = "false", value = "Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Will override the challenge's custom_launch_address if they do. Null to inherit from activity")
  public Boolean isCustomLaunchAddressAllowed() {
    return customLaunchAddressAllowed;
  }

  public void setCustomLaunchAddressAllowed(Boolean customLaunchAddressAllowed) {
    this.customLaunchAddressAllowed = customLaunchAddressAllowed;
  }

  public CoreChallengeActivitySettings hostOption(HostOptionEnum hostOption) {
    this.hostOption = hostOption;
    return this;
  }

   /**
   * Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Null to inherit
   * @return hostOption
  **/
  @ApiModelProperty(value = "Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Null to inherit")
  public HostOptionEnum getHostOption() {
    return hostOption;
  }

  public void setHostOption(HostOptionEnum hostOption) {
    this.hostOption = hostOption;
  }

  public CoreChallengeActivitySettings hostStatusControl(Boolean hostStatusControl) {
    this.hostStatusControl = hostStatusControl;
    return this;
  }

   /**
   * Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Max length: 255. Null to inherit from activity
   * @return hostStatusControl
  **/
  @ApiModelProperty(example = "false", value = "Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Max length: 255. Null to inherit from activity")
  public Boolean isHostStatusControl() {
    return hostStatusControl;
  }

  public void setHostStatusControl(Boolean hostStatusControl) {
    this.hostStatusControl = hostStatusControl;
  }

  public CoreChallengeActivitySettings joinInPlay(Boolean joinInPlay) {
    this.joinInPlay = joinInPlay;
    return this;
  }

   /**
   * Whether users can join while the status is PLAYING. Null to inherit from activity
   * @return joinInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether users can join while the status is PLAYING. Null to inherit from activity")
  public Boolean isJoinInPlay() {
    return joinInPlay;
  }

  public void setJoinInPlay(Boolean joinInPlay) {
    this.joinInPlay = joinInPlay;
  }

  public CoreChallengeActivitySettings leaveInPlay(Boolean leaveInPlay) {
    this.leaveInPlay = leaveInPlay;
    return this;
  }

   /**
   * Whether users can leave while the status is PLAYING. Null to inherit from activity
   * @return leaveInPlay
  **/
  @ApiModelProperty(example = "false", value = "Whether users can leave while the status is PLAYING. Null to inherit from activity")
  public Boolean isLeaveInPlay() {
    return leaveInPlay;
  }

  public void setLeaveInPlay(Boolean leaveInPlay) {
    this.leaveInPlay = leaveInPlay;
  }

  public CoreChallengeActivitySettings maxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * The maximum number of players the game can hold. Null to inherit from activity
   * @return maxPlayers
  **/
  @ApiModelProperty(value = "The maximum number of players the game can hold. Null to inherit from activity")
  public Integer getMaxPlayers() {
    return maxPlayers;
  }

  public void setMaxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
  }

  public CoreChallengeActivitySettings minPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
    return this;
  }

   /**
   * The minimum number of players the game can hold. Null to inherit from activity
   * @return minPlayers
  **/
  @ApiModelProperty(value = "The minimum number of players the game can hold. Null to inherit from activity")
  public Integer getMinPlayers() {
    return minPlayers;
  }

  public void setMinPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
  }

  public CoreChallengeActivitySettings resultsTrust(ResultsTrustEnum resultsTrust) {
    this.resultsTrust = resultsTrust;
    return this;
  }

   /**
   * Restriction for who is able to report game end and results. Admin is always able to send results as well. Null to inherit from activity
   * @return resultsTrust
  **/
  @ApiModelProperty(value = "Restriction for who is able to report game end and results. Admin is always able to send results as well. Null to inherit from activity")
  public ResultsTrustEnum getResultsTrust() {
    return resultsTrust;
  }

  public void setResultsTrust(ResultsTrustEnum resultsTrust) {
    this.resultsTrust = resultsTrust;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreChallengeActivitySettings coreChallengeActivitySettings = (CoreChallengeActivitySettings) o;
    return Objects.equals(this.bootInPlay, coreChallengeActivitySettings.bootInPlay) &&
        Objects.equals(this.customLaunchAddress, coreChallengeActivitySettings.customLaunchAddress) &&
        Objects.equals(this.customLaunchAddressAllowed, coreChallengeActivitySettings.customLaunchAddressAllowed) &&
        Objects.equals(this.hostOption, coreChallengeActivitySettings.hostOption) &&
        Objects.equals(this.hostStatusControl, coreChallengeActivitySettings.hostStatusControl) &&
        Objects.equals(this.joinInPlay, coreChallengeActivitySettings.joinInPlay) &&
        Objects.equals(this.leaveInPlay, coreChallengeActivitySettings.leaveInPlay) &&
        Objects.equals(this.maxPlayers, coreChallengeActivitySettings.maxPlayers) &&
        Objects.equals(this.minPlayers, coreChallengeActivitySettings.minPlayers) &&
        Objects.equals(this.resultsTrust, coreChallengeActivitySettings.resultsTrust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootInPlay, customLaunchAddress, customLaunchAddressAllowed, hostOption, hostStatusControl, joinInPlay, leaveInPlay, maxPlayers, minPlayers, resultsTrust);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreChallengeActivitySettings {\n");
    
    sb.append("    bootInPlay: ").append(toIndentedString(bootInPlay)).append("\n");
    sb.append("    customLaunchAddress: ").append(toIndentedString(customLaunchAddress)).append("\n");
    sb.append("    customLaunchAddressAllowed: ").append(toIndentedString(customLaunchAddressAllowed)).append("\n");
    sb.append("    hostOption: ").append(toIndentedString(hostOption)).append("\n");
    sb.append("    hostStatusControl: ").append(toIndentedString(hostStatusControl)).append("\n");
    sb.append("    joinInPlay: ").append(toIndentedString(joinInPlay)).append("\n");
    sb.append("    leaveInPlay: ").append(toIndentedString(leaveInPlay)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    minPlayers: ").append(toIndentedString(minPlayers)).append("\n");
    sb.append("    resultsTrust: ").append(toIndentedString(resultsTrust)).append("\n");
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

