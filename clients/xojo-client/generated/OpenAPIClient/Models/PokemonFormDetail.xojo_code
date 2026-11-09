#tag Class
Protected Class PokemonFormDetail

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
			The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
		#tag EndNote
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The order in which forms should be sorted within a species' forms.
		#tag EndNote
		form_order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			True for exactly one form used as the default for each Pokémon.
		#tag EndNote
		is_default As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this form can only happen during battle.
		#tag EndNote
		is_battle_only As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this form requires mega evolution.
		#tag EndNote
		is_mega As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this form.
		#tag EndNote
		form_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Pokémon that can take on this form.
		#tag EndNote
		pokemon As OpenAPIClient.Models.PokemonSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A set of sprites used to depict this Pokémon form in the game.
		#tag EndNote
		sprites As OpenAPIClient.Models.PokemonFormSprites
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The version group this Pokémon form was introduced in.
		#tag EndNote
		version_group As OpenAPIClient.Models.VersionGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
		#tag EndNote
		form_names() As OpenAPIClient.Models.PokemonFormName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
		#tag EndNote
		names() As OpenAPIClient.Models.PokemonFormName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details showing types this Pokémon form has.
		#tag EndNote
		types() As OpenAPIClient.Models.PokemonFormType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
		#tag EndNote
		trigger_conditions() As OpenAPIClient.Models.PokemonFormTriggerCondition
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The flavor text of this form listed in different languages and versions.
		#tag EndNote
		flavor_text_entries() As OpenAPIClient.Models.PokemonFormFlavorText
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
			Name="order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="form_order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_battle_only"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_mega"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="form_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sprites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormSprites"
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
		#tag ViewProperty
			Name="form_names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="trigger_conditions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormTriggerCondition"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormFlavorText"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


