package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1APIServiceConditionBuilder extends io.kubernetes.client.openapi.models.V1APIServiceConditionFluentImpl<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIServiceCondition,io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder>{
  public V1APIServiceConditionBuilder() {
    this(false);
  }
  public V1APIServiceConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1APIServiceCondition(), validationEnabled);
  }
  public V1APIServiceConditionBuilder(io.kubernetes.client.openapi.models.V1APIServiceConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIServiceConditionBuilder(io.kubernetes.client.openapi.models.V1APIServiceConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1APIServiceCondition(), validationEnabled);
  }
  public V1APIServiceConditionBuilder(io.kubernetes.client.openapi.models.V1APIServiceConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIServiceCondition instance) {
    this(fluent, instance, false);
  }
  public V1APIServiceConditionBuilder(io.kubernetes.client.openapi.models.V1APIServiceConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIServiceCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIServiceConditionBuilder(io.kubernetes.client.openapi.models.V1APIServiceCondition instance) {
    this(instance,false);
  }
  public V1APIServiceConditionBuilder(io.kubernetes.client.openapi.models.V1APIServiceCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1APIServiceConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1APIServiceCondition build() {
    V1APIServiceCondition buildable = new V1APIServiceCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1APIServiceConditionBuilder that = (V1APIServiceConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}