#tag Class
Protected Class TypeRelationships

	#tag Property, Flags = &h0
		#tag Note
			A list of types this type has no effect on.
		#tag EndNote
		no_damage_to() As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of types this type is not very effect against.
		#tag EndNote
		half_damage_to() As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of types this type is very effect against.
		#tag EndNote
		double_damage_to() As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of types that have no effect on this type.
		#tag EndNote
		no_damage_from() As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of types that are not very effective against this type.
		#tag EndNote
		half_damage_from() As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of types that are very effective against this type.
		#tag EndNote
		double_damage_from() As OpenAPIClient.Models.TypeSummary
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
			Name="no_damage_to"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="half_damage_to"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="double_damage_to"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="no_damage_from"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="half_damage_from"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="double_damage_from"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


