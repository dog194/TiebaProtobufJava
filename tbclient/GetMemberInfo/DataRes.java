package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Feedback;
import tbclient.ForumMember;
import tbclient.MemberGroupInfo;
import tbclient.PriManagerApplyInfo;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(tag = 2)
    public final ForumMember forum_member_info;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_bawuapply_show;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_private_forum;

    @ProtoField(tag = 4)
    public final ManagerApplyInfo manager_apply_info;

    @ProtoField(tag = 8)
    public final Feedback manager_complain_info;

    @ProtoField(tag = 3)
    public final MemberGodInfo member_god_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<MemberGroupInfo> member_group_info;

    @ProtoField(tag = 7)
    public final PriManagerApplyInfo primanager_apply_info;
    public static final List<MemberGroupInfo> DEFAULT_MEMBER_GROUP_INFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_PRIVATE_FORUM = 0;
    public static final Integer DEFAULT_IS_BAWUAPPLY_SHOW = 0;

    public static final class Builder extends Message.Builder<DataRes> {
        public ForumMember forum_member_info;
        public Integer is_bawuapply_show;
        public Integer is_private_forum;
        public ManagerApplyInfo manager_apply_info;
        public Feedback manager_complain_info;
        public MemberGodInfo member_god_info;
        public List<MemberGroupInfo> member_group_info;
        public PriManagerApplyInfo primanager_apply_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.member_group_info = Message.copyOf(dataRes.member_group_info);
            this.forum_member_info = dataRes.forum_member_info;
            this.member_god_info = dataRes.member_god_info;
            this.manager_apply_info = dataRes.manager_apply_info;
            this.is_private_forum = dataRes.is_private_forum;
            this.is_bawuapply_show = dataRes.is_bawuapply_show;
            this.primanager_apply_info = dataRes.primanager_apply_info;
            this.manager_complain_info = dataRes.manager_complain_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<MemberGroupInfo> list = builder.member_group_info;
            if (list == null) {
                this.member_group_info = DEFAULT_MEMBER_GROUP_INFO;
            } else {
                this.member_group_info = Message.immutableCopyOf(list);
            }
            this.forum_member_info = builder.forum_member_info;
            this.member_god_info = builder.member_god_info;
            this.manager_apply_info = builder.manager_apply_info;
            Integer num = builder.is_private_forum;
            if (num == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num;
            }
            Integer num2 = builder.is_bawuapply_show;
            if (num2 == null) {
                this.is_bawuapply_show = DEFAULT_IS_BAWUAPPLY_SHOW;
            } else {
                this.is_bawuapply_show = num2;
            }
            this.primanager_apply_info = builder.primanager_apply_info;
            this.manager_complain_info = builder.manager_complain_info;
            return;
        }
        this.member_group_info = Message.immutableCopyOf(builder.member_group_info);
        this.forum_member_info = builder.forum_member_info;
        this.member_god_info = builder.member_god_info;
        this.manager_apply_info = builder.manager_apply_info;
        this.is_private_forum = builder.is_private_forum;
        this.is_bawuapply_show = builder.is_bawuapply_show;
        this.primanager_apply_info = builder.primanager_apply_info;
        this.manager_complain_info = builder.manager_complain_info;
    }
}