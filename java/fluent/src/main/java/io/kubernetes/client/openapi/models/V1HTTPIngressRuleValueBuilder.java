package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1HTTPIngressRuleValueBuilder extends io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluentImpl<io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue,io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder>{
  public V1HTTPIngressRuleValueBuilder() {
    this(false);
  }
  public V1HTTPIngressRuleValueBuilder(java.lang.Boolean validationEnabled) {
    this(new V1HTTPIngressRuleValue(), validationEnabled);
  }
  public V1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1HTTPIngressRuleValue(), validationEnabled);
  }
  public V1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent,io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance) {
    this(fluent, instance, false);
  }
  public V1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent,io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPaths(instance.getPaths());

    this.validationEnabled = validationEnabled; 
  }
  public V1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance) {
    this(instance,false);
  }
  public V1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withPaths(instance.getPaths());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue build() {
    V1HTTPIngressRuleValue buildable = new V1HTTPIngressRuleValue();
    buildable.setPaths(fluent.getPaths());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HTTPIngressRuleValueBuilder that = (V1HTTPIngressRuleValueBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}