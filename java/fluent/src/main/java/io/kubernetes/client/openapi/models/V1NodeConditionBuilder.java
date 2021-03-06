package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NodeConditionBuilder extends io.kubernetes.client.openapi.models.V1NodeConditionFluentImpl<io.kubernetes.client.openapi.models.V1NodeConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeCondition,io.kubernetes.client.openapi.models.V1NodeConditionBuilder>{
  public V1NodeConditionBuilder() {
    this(false);
  }
  public V1NodeConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NodeCondition(), validationEnabled);
  }
  public V1NodeConditionBuilder(io.kubernetes.client.openapi.models.V1NodeConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeConditionBuilder(io.kubernetes.client.openapi.models.V1NodeConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeCondition(), validationEnabled);
  }
  public V1NodeConditionBuilder(io.kubernetes.client.openapi.models.V1NodeConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeCondition instance) {
    this(fluent, instance, false);
  }
  public V1NodeConditionBuilder(io.kubernetes.client.openapi.models.V1NodeConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastHeartbeatTime(instance.getLastHeartbeatTime());

    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeConditionBuilder(io.kubernetes.client.openapi.models.V1NodeCondition instance) {
    this(instance,false);
  }
  public V1NodeConditionBuilder(io.kubernetes.client.openapi.models.V1NodeCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastHeartbeatTime(instance.getLastHeartbeatTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NodeConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NodeCondition build() {
    V1NodeCondition buildable = new V1NodeCondition();
    buildable.setLastHeartbeatTime(fluent.getLastHeartbeatTime());
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
    V1NodeConditionBuilder that = (V1NodeConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}