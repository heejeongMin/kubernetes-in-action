package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1RunAsGroupStrategyOptionsBuilder extends io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluentImpl<io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions,io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder>{
  public V1beta1RunAsGroupStrategyOptionsBuilder() {
    this(false);
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1RunAsGroupStrategyOptions(), validationEnabled);
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1RunAsGroupStrategyOptions(), validationEnabled);
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions instance) {
    this(fluent, instance, false);
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRanges(instance.getRanges());

    fluent.withRule(instance.getRule());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions instance) {
    this(instance,false);
  }
  public V1beta1RunAsGroupStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withRanges(instance.getRanges());

    this.withRule(instance.getRule());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions build() {
    V1beta1RunAsGroupStrategyOptions buildable = new V1beta1RunAsGroupStrategyOptions();
    buildable.setRanges(fluent.getRanges());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1RunAsGroupStrategyOptionsBuilder that = (V1beta1RunAsGroupStrategyOptionsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}