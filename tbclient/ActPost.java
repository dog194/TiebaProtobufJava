package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ActPost extends Message {
    public static final List<ActHot> DEFAULT_ACT_HOT = Collections.emptyList();
    public static final List<LinkInfo> DEFAULT_LINK_INFO = Collections.emptyList();
    public static final String DEFAULT_LIST_HEAD = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ActHot> act_hot;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<LinkInfo> link_info;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String list_head;

    public static final class Builder extends Message.Builder<ActPost> {
        public List<ActHot> act_hot;
        public List<LinkInfo> link_info;
        public String list_head;

        public Builder() {
        }

        public Builder(ActPost actPost) {
            super(actPost);
            if (actPost == null) {
                return;
            }
            this.act_hot = Message.copyOf(actPost.act_hot);
            this.list_head = actPost.list_head;
            this.link_info = Message.copyOf(actPost.link_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public ActPost build(boolean z) {
            return new ActPost(this, z);
        }
    }

    public ActPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ActHot> list = builder.act_hot;
            if (list == null) {
                this.act_hot = DEFAULT_ACT_HOT;
            } else {
                this.act_hot = Message.immutableCopyOf(list);
            }
            String str = builder.list_head;
            if (str == null) {
                this.list_head = "";
            } else {
                this.list_head = str;
            }
            List<LinkInfo> list2 = builder.link_info;
            if (list2 == null) {
                this.link_info = DEFAULT_LINK_INFO;
                return;
            } else {
                this.link_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.act_hot = Message.immutableCopyOf(builder.act_hot);
        this.list_head = builder.list_head;
        this.link_info = Message.immutableCopyOf(builder.link_info);
    }
}