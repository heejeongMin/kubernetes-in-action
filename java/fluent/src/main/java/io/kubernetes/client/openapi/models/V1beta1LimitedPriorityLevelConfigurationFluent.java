package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1LimitedPriorityLevelConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getAssuredConcurrencyShares();
  public A withAssuredConcurrencyShares(java.lang.Integer assuredConcurrencyShares);
  public java.lang.Boolean hasAssuredConcurrencyShares();
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1LimitResponse getLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta1LimitResponse buildLimitResponse();
  public A withLimitResponse(io.kubernetes.client.openapi.models.V1beta1LimitResponse limitResponse);
  public java.lang.Boolean hasLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta1LimitResponse item);
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta1LimitResponse item);
  public interface LimitResponseNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>>{
    public N and();
    public N endLimitResponse();
    
  }
  
}