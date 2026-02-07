#tag Class
Protected Class PokemonSpeciesDetailPalParkEncountersInner

	#tag Property, Flags = &h0
		area As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
	#tag EndProperty


	#tag Property, Flags = &h0
		base_score As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		rate As Integer
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
			Name="area"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityDetailPokemonInnerPokemon"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="base_score"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


