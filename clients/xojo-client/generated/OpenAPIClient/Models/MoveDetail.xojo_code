#tag Class
Protected Class MoveDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		accuracy As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_chance As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		pp As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		priority As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		power As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		contest_combos As OpenAPIClient.Models.MoveDetailContestCombos
	#tag EndProperty


	#tag Property, Flags = &h0
		contest_type As OpenAPIClient.Models.ContestTypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		contest_effect As OpenAPIClient.Models.ContestEffectSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		damage_class As OpenAPIClient.Models.MoveDamageClassSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_entries() As OpenAPIClient.Models.MoveChangeEffectEntriesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_changes() As OpenAPIClient.Models.MoveDetailEffectChangesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		meta As OpenAPIClient.Models.MoveMeta
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.MoveName
	#tag EndProperty


	#tag Property, Flags = &h0
		past_values() As OpenAPIClient.Models.MoveChange
	#tag EndProperty


	#tag Property, Flags = &h0
		stat_changes() As OpenAPIClient.Models.MoveDetailStatChangesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		super_contest_effect As OpenAPIClient.Models.SuperContestEffectSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		target As OpenAPIClient.Models.MoveTargetSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		type As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		machines() As OpenAPIClient.Models.MoveDetailMachinesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		flavor_text_entries() As OpenAPIClient.Models.MoveFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		learned_by_pokemon() As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
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
			Name="accuracy"
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
			Name="pp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="priority"
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
			Name="contest_combos"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDetailContestCombos"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="contest_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ContestTypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="contest_effect"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ContestEffectSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="damage_class"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDamageClassSummary"
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
			Name="effect_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDetailEffectChangesInner"
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
			Name="meta"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveMeta"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveChange"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stat_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDetailStatChangesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="super_contest_effect"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SuperContestEffectSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="target"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveTargetSummary"
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
			Name="machines"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDetailMachinesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveFlavorText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="learned_by_pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityDetailPokemonInnerPokemon"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


