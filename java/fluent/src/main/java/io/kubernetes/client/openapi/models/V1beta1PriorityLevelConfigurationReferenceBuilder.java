package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationReferenceBuilder extends io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluentImpl<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceBuilder>{
  public V1beta1PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference build() {
    V1beta1PriorityLevelConfigurationReference buildable = new V1beta1PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1PriorityLevelConfigurationReferenceBuilder that = (V1beta1PriorityLevelConfigurationReferenceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}