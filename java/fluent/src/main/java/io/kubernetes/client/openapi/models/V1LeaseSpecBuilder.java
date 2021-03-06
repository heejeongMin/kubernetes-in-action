package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1LeaseSpecBuilder extends io.kubernetes.client.openapi.models.V1LeaseSpecFluentImpl<io.kubernetes.client.openapi.models.V1LeaseSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LeaseSpec,io.kubernetes.client.openapi.models.V1LeaseSpecBuilder>{
  public V1LeaseSpecBuilder() {
    this(false);
  }
  public V1LeaseSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1LeaseSpec(), validationEnabled);
  }
  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1LeaseSpec(), validationEnabled);
  }
  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1LeaseSpec instance) {
    this(fluent, instance, false);
  }
  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1LeaseSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAcquireTime(instance.getAcquireTime());

    fluent.withHolderIdentity(instance.getHolderIdentity());

    fluent.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    fluent.withLeaseTransitions(instance.getLeaseTransitions());

    fluent.withRenewTime(instance.getRenewTime());

    this.validationEnabled = validationEnabled; 
  }
  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpec instance) {
    this(instance,false);
  }
  public V1LeaseSpecBuilder(io.kubernetes.client.openapi.models.V1LeaseSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAcquireTime(instance.getAcquireTime());

    this.withHolderIdentity(instance.getHolderIdentity());

    this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    this.withLeaseTransitions(instance.getLeaseTransitions());

    this.withRenewTime(instance.getRenewTime());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1LeaseSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1LeaseSpec build() {
    V1LeaseSpec buildable = new V1LeaseSpec();
    buildable.setAcquireTime(fluent.getAcquireTime());
    buildable.setHolderIdentity(fluent.getHolderIdentity());
    buildable.setLeaseDurationSeconds(fluent.getLeaseDurationSeconds());
    buildable.setLeaseTransitions(fluent.getLeaseTransitions());
    buildable.setRenewTime(fluent.getRenewTime());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LeaseSpecBuilder that = (V1LeaseSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}