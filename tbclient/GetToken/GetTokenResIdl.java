package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetTokenResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetTokenResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetTokenResIdl getTokenResIdl) {
            super(getTokenResIdl);
            if (getTokenResIdl == null) {
                return;
            }
            this.error = getTokenResIdl.error;
            this.data = getTokenResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetTokenResIdl build(boolean z) {
            return new GetTokenResIdl(this, z);
        }
    }

    public GetTokenResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}