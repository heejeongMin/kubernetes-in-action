package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1DeploymentBuilder extends io.kubernetes.client.openapi.models.V1DeploymentFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Deployment,io.kubernetes.client.openapi.models.V1DeploymentBuilder>{
  public V1DeploymentBuilder() {
    this(false);
  }
  public V1DeploymentBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Deployment(), validationEnabled);
  }
  public V1DeploymentBuilder(io.kubernetes.client.openapi.models.V1DeploymentFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeploymentBuilder(io.kubernetes.client.openapi.models.V1DeploymentFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Deployment(), validationEnabled);
  }
  public V1DeploymentBuilder(io.kubernetes.client.openapi.models.V1DeploymentFluent<?> fluent,io.kubernetes.client.openapi.models.V1Deployment instance) {
    this(fluent, instance, false);
  }
  public V1DeploymentBuilder(io.kubernetes.client.openapi.models.V1DeploymentFluent<?> fluent,io.kubernetes.client.openapi.models.V1Deployment instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeploymentBuilder(io.kubernetes.client.openapi.models.V1Deployment instance) {
    this(instance,false);
  }
  public V1DeploymentBuilder(io.kubernetes.client.openapi.models.V1Deployment instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1DeploymentFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Deployment build() {
    V1Deployment buildable = new V1Deployment();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DeploymentBuilder that = (V1DeploymentBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}