package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PreferredSchedulingTermBuilder extends io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluentImpl<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm,io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>{
  public V1PreferredSchedulingTermBuilder() {
    this(false);
  }
  public V1PreferredSchedulingTermBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PreferredSchedulingTerm(), validationEnabled);
  }
  public V1PreferredSchedulingTermBuilder(io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PreferredSchedulingTermBuilder(io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PreferredSchedulingTerm(), validationEnabled);
  }
  public V1PreferredSchedulingTermBuilder(io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm instance) {
    this(fluent, instance, false);
  }
  public V1PreferredSchedulingTermBuilder(io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPreference(instance.getPreference());

    fluent.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled; 
  }
  public V1PreferredSchedulingTermBuilder(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm instance) {
    this(instance,false);
  }
  public V1PreferredSchedulingTermBuilder(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withPreference(instance.getPreference());

    this.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm build() {
    V1PreferredSchedulingTerm buildable = new V1PreferredSchedulingTerm();
    buildable.setPreference(fluent.getPreference());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PreferredSchedulingTermBuilder that = (V1PreferredSchedulingTermBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}