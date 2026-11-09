#tag Class
Protected Class MoveDetail

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
			The percent value of how likely this move is to be successful.
		#tag EndNote
		accuracy As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The percent value of how likely it is this moves effect will happen.
		#tag EndNote
		effect_chance As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Power points. The number of times this move can be used.
		#tag EndNote
		pp As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
		#tag EndNote
		priority As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The base power of this move, or null if it has no fixed base power.
		#tag EndNote
		power As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A detail of normal and super contest combos that require this move.
		#tag EndNote
		contest_combos As OpenAPIClient.Models.MoveCombos
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of appeal this move gives a Pokémon when used in a contest.
		#tag EndNote
		contest_type As OpenAPIClient.Models.ContestTypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The effect the move has when used in a contest.
		#tag EndNote
		contest_effect As OpenAPIClient.Models.ContestEffectSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of damage the move inflicts on the target, e.g. physical.
		#tag EndNote
		damage_class As OpenAPIClient.Models.MoveDamageClassSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The effect of this move listed in different languages.
		#tag EndNote
		effect_entries() As OpenAPIClient.Models.MoveEffectEffectText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The list of previous effects this move has had across version groups of the games.
		#tag EndNote
		effect_changes() As OpenAPIClient.Models.MoveEffectChange
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The generation in which this move was introduced.
		#tag EndNote
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metadata about this move
		#tag EndNote
		meta As OpenAPIClient.Models.MoveMeta
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.MoveName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of move resource value changes across version groups of the game.
		#tag EndNote
		past_values() As OpenAPIClient.Models.MoveChange
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of stats this moves effects and how much it effects them.
		#tag EndNote
		stat_changes() As OpenAPIClient.Models.MoveMetaStatChange
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The effect the move has when used in a super contest.
		#tag EndNote
		super_contest_effect As OpenAPIClient.Models.SuperContestEffectSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of target that will receive the effects of the attack.
		#tag EndNote
		target As OpenAPIClient.Models.MoveTargetSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The elemental type of this move.
		#tag EndNote
		type As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of the machines that teach this move.
		#tag EndNote
		machines() As OpenAPIClient.Models.ItemMachine
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The flavor text of this move listed in different languages.
		#tag EndNote
		flavor_text_entries() As OpenAPIClient.Models.MoveFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of Pokemon that can learn the move
		#tag EndNote
		learned_by_pokemon() As OpenAPIClient.Models.PokemonSummary
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
			Type="MoveCombos"
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
			Type="MoveEffectEffectText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveEffectChange"
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
			Type="MoveMetaStatChange"
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
			Type="ItemMachine"
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
			Type="PokemonSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


