#tag Class
Protected Class AbilityDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this ability originated in the main series of the video games.
		#tag EndNote
		is_main_series As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The generation this ability originated in.
		#tag EndNote
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.AbilityName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The effect of this ability listed in different languages.
		#tag EndNote
		effect_entries() As OpenAPIClient.Models.AbilityEffectText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The list of previous effects this ability has had across version groups.
		#tag EndNote
		effect_changes() As OpenAPIClient.Models.AbilityChange
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The flavor text of this ability listed in different languages.
		#tag EndNote
		flavor_text_entries() As OpenAPIClient.Models.AbilityFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokémon that could potentially have this ability.
		#tag EndNote
		pokemon() As OpenAPIClient.Models.AbilityPokemonDetail
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_main_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
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
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityEffectText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityChange"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityFlavorText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityPokemonDetail"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


