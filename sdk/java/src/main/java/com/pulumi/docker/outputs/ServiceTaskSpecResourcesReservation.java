// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.docker.outputs.ServiceTaskSpecResourcesReservationGenericResources;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecResourcesReservation {
    private @Nullable ServiceTaskSpecResourcesReservationGenericResources genericResources;
    private @Nullable Integer memoryBytes;
    private @Nullable Integer nanoCpus;

    private ServiceTaskSpecResourcesReservation() {}
    public Optional<ServiceTaskSpecResourcesReservationGenericResources> genericResources() {
        return Optional.ofNullable(this.genericResources);
    }
    public Optional<Integer> memoryBytes() {
        return Optional.ofNullable(this.memoryBytes);
    }
    public Optional<Integer> nanoCpus() {
        return Optional.ofNullable(this.nanoCpus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesReservation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceTaskSpecResourcesReservationGenericResources genericResources;
        private @Nullable Integer memoryBytes;
        private @Nullable Integer nanoCpus;
        public Builder() {}
        public Builder(ServiceTaskSpecResourcesReservation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericResources = defaults.genericResources;
    	      this.memoryBytes = defaults.memoryBytes;
    	      this.nanoCpus = defaults.nanoCpus;
        }

        @CustomType.Setter
        public Builder genericResources(@Nullable ServiceTaskSpecResourcesReservationGenericResources genericResources) {
            this.genericResources = genericResources;
            return this;
        }
        @CustomType.Setter
        public Builder memoryBytes(@Nullable Integer memoryBytes) {
            this.memoryBytes = memoryBytes;
            return this;
        }
        @CustomType.Setter
        public Builder nanoCpus(@Nullable Integer nanoCpus) {
            this.nanoCpus = nanoCpus;
            return this;
        }
        public ServiceTaskSpecResourcesReservation build() {
            final var o = new ServiceTaskSpecResourcesReservation();
            o.genericResources = genericResources;
            o.memoryBytes = memoryBytes;
            o.nanoCpus = nanoCpus;
            return o;
        }
    }
}
