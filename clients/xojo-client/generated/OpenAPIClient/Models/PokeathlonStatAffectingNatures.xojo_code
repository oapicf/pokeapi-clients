#tag Class
Protected Class PokeathlonStatAffectingNatures

	#tag Property, Flags = &h0
		#tag Note
			A list of natures and how they change the referenced Pokéathlon stat.
		#tag EndNote
		increase() As OpenAPIClient.Models.PokeathlonStatAffectingNature
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of natures and how they change the referenced Pokéathlon stat.
		#tag EndNote
		decrease() As OpenAPIClient.Models.PokeathlonStatAffectingNature
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
			Name="increase"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokeathlonStatAffectingNature"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decrease"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokeathlonStatAffectingNature"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


