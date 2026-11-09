#tag Class
Protected Class PokemonPastAbility

	#tag Property, Flags = &h0
		#tag Note
			The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
		#tag EndNote
		abilities() As OpenAPIClient.Models.PokemonAbilityPast
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The last generation in which the referenced pokémon had the listed abilities.
		#tag EndNote
		generation As OpenAPIClient.Models.GenerationSummary
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
			Name="abilities"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonAbilityPast"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


