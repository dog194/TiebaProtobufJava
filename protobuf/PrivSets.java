package protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PrivSets extends Message {

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer bazhuShowInside;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer bazhuShowOutside;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer friend;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer group;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer like;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer live;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer location;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer post;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer reply;
    public static final Integer DEFAULT_LOCATION = 0;
    public static final Integer DEFAULT_LIKE = 0;
    public static final Integer DEFAULT_GROUP = 0;
    public static final Integer DEFAULT_POST = 0;
    public static final Integer DEFAULT_FRIEND = 0;
    public static final Integer DEFAULT_LIVE = 0;
    public static final Integer DEFAULT_REPLY = 0;
    public static final Integer DEFAULT_BAZHUSHOWINSIDE = 0;
    public static final Integer DEFAULT_BAZHUSHOWOUTSIDE = 0;

    public static final class Builder extends Message.Builder<PrivSets> {
        public Integer bazhuShowInside;
        public Integer bazhuShowOutside;
        public Integer friend;
        public Integer group;
        public Integer like;
        public Integer live;
        public Integer location;
        public Integer post;
        public Integer reply;

        public Builder() {
        }

        public Builder(PrivSets privSets) {
            super(privSets);
            if (privSets == null) {
                return;
            }
            this.location = privSets.location;
            this.like = privSets.like;
            this.group = privSets.group;
            this.post = privSets.post;
            this.friend = privSets.friend;
            this.live = privSets.live;
            this.reply = privSets.reply;
            this.bazhuShowInside = privSets.bazhuShowInside;
            this.bazhuShowOutside = privSets.bazhuShowOutside;
        }

        @Override // com.squareup.wire.Message.Builder
        public PrivSets build(boolean z) {
            return new PrivSets(this, z);
        }
    }

    public PrivSets(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.location;
            if (num == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = num;
            }
            Integer num2 = builder.like;
            if (num2 == null) {
                this.like = DEFAULT_LIKE;
            } else {
                this.like = num2;
            }
            Integer num3 = builder.group;
            if (num3 == null) {
                this.group = DEFAULT_GROUP;
            } else {
                this.group = num3;
            }
            Integer num4 = builder.post;
            if (num4 == null) {
                this.post = DEFAULT_POST;
            } else {
                this.post = num4;
            }
            Integer num5 = builder.friend;
            if (num5 == null) {
                this.friend = DEFAULT_FRIEND;
            } else {
                this.friend = num5;
            }
            Integer num6 = builder.live;
            if (num6 == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = num6;
            }
            Integer num7 = builder.reply;
            if (num7 == null) {
                this.reply = DEFAULT_REPLY;
            } else {
                this.reply = num7;
            }
            Integer num8 = builder.bazhuShowInside;
            if (num8 == null) {
                this.bazhuShowInside = DEFAULT_BAZHUSHOWINSIDE;
            } else {
                this.bazhuShowInside = num8;
            }
            Integer num9 = builder.bazhuShowOutside;
            if (num9 == null) {
                this.bazhuShowOutside = DEFAULT_BAZHUSHOWOUTSIDE;
                return;
            } else {
                this.bazhuShowOutside = num9;
                return;
            }
        }
        this.location = builder.location;
        this.like = builder.like;
        this.group = builder.group;
        this.post = builder.post;
        this.friend = builder.friend;
        this.live = builder.live;
        this.reply = builder.reply;
        this.bazhuShowInside = builder.bazhuShowInside;
        this.bazhuShowOutside = builder.bazhuShowOutside;
    }
}