#tag Class
Protected Class MoveMeta

	#tag Property, Flags = &h0
		#tag Note
			The status ailment this move inflicts on its target.
		#tag EndNote
		ailment As OpenAPIClient.Models.MoveMetaAilmentSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The category of move this move falls under, e.g. damage or ailment.
		#tag EndNote
		category As OpenAPIClient.Models.MoveMetaCategorySummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum number of times this move hits. Null if it always only hits once.
		#tag EndNote
		min_hits As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of times this move hits. Null if it always only hits once.
		#tag EndNote
		max_hits As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
		#tag EndNote
		min_turns As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
		#tag EndNote
		max_turns As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
		#tag EndNote
		drain As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
		#tag EndNote
		healing As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Critical hit rate bonus.
		#tag EndNote
		crit_rate As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The likelihood this attack will cause an ailment.
		#tag EndNote
		ailment_chance As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The likelihood this attack will cause the target Pokémon to flinch.
		#tag EndNote
		flinch_chance As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The likelihood this attack will cause a stat change in the target Pokémon.
		#tag EndNote
		stat_chance As Xoson.O.OptionalInteger
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ailment"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveMetaAilmentSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="category"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveMetaCategorySummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_hits"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_hits"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_turns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_turns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="drain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="healing"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="crit_rate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ailment_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flinch_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stat_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


