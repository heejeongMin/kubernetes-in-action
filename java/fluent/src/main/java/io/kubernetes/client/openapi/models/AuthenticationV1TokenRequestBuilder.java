package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class AuthenticationV1TokenRequestBuilder extends io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestFluentImpl<io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest,io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestBuilder>{
  public AuthenticationV1TokenRequestBuilder() {
    this(false);
  }
  public AuthenticationV1TokenRequestBuilder(java.lang.Boolean validationEnabled) {
    this(new AuthenticationV1TokenRequest(), validationEnabled);
  }
  public AuthenticationV1TokenRequestBuilder(io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestFluent<?> fluent) {
    this(fluent, false);
  }
  public AuthenticationV1TokenRequestBuilder(io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new AuthenticationV1TokenRequest(), validationEnabled);
  }
  public AuthenticationV1TokenRequestBuilder(io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestFluent<?> fluent,io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest instance) {
    this(fluent, instance, false);
  }
  public AuthenticationV1TokenRequestBuilder(io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestFluent<?> fluent,io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public AuthenticationV1TokenRequestBuilder(io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest instance) {
    this(instance,false);
  }
  public AuthenticationV1TokenRequestBuilder(io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.AuthenticationV1TokenRequestFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest build() {
    AuthenticationV1TokenRequest buildable = new AuthenticationV1TokenRequest();
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
    AuthenticationV1TokenRequestBuilder that = (AuthenticationV1TokenRequestBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}