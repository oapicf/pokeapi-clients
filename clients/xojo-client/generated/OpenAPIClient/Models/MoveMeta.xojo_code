#tag Class
Protected Class MoveMeta

	#tag Property, Flags = &h0
		ailment As OpenAPIClient.Models.MoveMetaAilmentSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		category As OpenAPIClient.Models.MoveMetaCategorySummary
	#tag EndProperty


	#tag Property, Flags = &h0
		min_hits As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		max_hits As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		min_turns As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		max_turns As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		drain As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		healing As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		crit_rate As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		ailment_chance As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		flinch_chance As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
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


