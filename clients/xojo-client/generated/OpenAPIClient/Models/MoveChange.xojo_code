#tag Class
Protected Class MoveChange

	#tag Property, Flags = &h0
		accuracy As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		power As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		pp As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_chance As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_entries() As OpenAPIClient.Models.MoveChangeEffectEntriesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		type As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		version_group As OpenAPIClient.Models.VersionGroupSummary
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
			Name="accuracy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="power"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveChangeEffectEntriesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


