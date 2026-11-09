#tag Class
Protected Class PokeathlonStatAffectingNature

	#tag Property, Flags = &h0
		#tag Note
			The maximum amount of change to the referenced Pokéathlon stat.
		#tag EndNote
		max_change As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The nature causing the change.
		#tag EndNote
		nature As OpenAPIClient.Models.NatureSummary
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
			Name="max_change"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="nature"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


