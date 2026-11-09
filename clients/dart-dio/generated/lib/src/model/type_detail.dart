//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/type_game_sprite.dart';
import 'package:openapi/src/model/type_name.dart';
import 'package:openapi/src/model/move_damage_class_summary.dart';
import 'package:openapi/src/model/type_pokemon.dart';
import 'package:openapi/src/model/type_past_relationships.dart';
import 'package:openapi/src/model/type_relationships.dart';
import 'package:openapi/src/model/type_game_index.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail.g.dart';

/// Serializer for the Type resource
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [damageRelations] - A detail of how effective this type is toward others and vice versa.
/// * [pastDamageRelations] - A list of details of how effective this type was toward others and vice versa in previous generations
/// * [gameIndices] - A list of game indices relevent to this item by generation.
/// * [generation] - The generation this type was introduced in.
/// * [moveDamageClass] - The class of damage inflicted by this type.
/// * [names] - The name of this resource listed in different languages.
/// * [pokemon] - A list of details of Pokémon that have this type.
/// * [moves] - A list of moves that have this type.
/// * [sprites] - Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
@BuiltValue()
abstract class TypeDetail implements Built<TypeDetail, TypeDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// A detail of how effective this type is toward others and vice versa.
  @BuiltValueField(wireName: r'damage_relations')
  TypeRelationships get damageRelations;

  /// A list of details of how effective this type was toward others and vice versa in previous generations
  @BuiltValueField(wireName: r'past_damage_relations')
  BuiltList<TypePastRelationships> get pastDamageRelations;

  /// A list of game indices relevent to this item by generation.
  @BuiltValueField(wireName: r'game_indices')
  BuiltList<TypeGameIndex> get gameIndices;

  /// The generation this type was introduced in.
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  /// The class of damage inflicted by this type.
  @BuiltValueField(wireName: r'move_damage_class')
  MoveDamageClassSummary? get moveDamageClass;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<TypeName> get names;

  /// A list of details of Pokémon that have this type.
  @BuiltValueField(wireName: r'pokemon')
  BuiltList<TypePokemon> get pokemon;

  /// A list of moves that have this type.
  @BuiltValueField(wireName: r'moves')
  BuiltList<MoveSummary> get moves;

  /// Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
  @BuiltValueField(wireName: r'sprites')
  BuiltMap<String, BuiltMap<String, TypeGameSprite>> get sprites;

  TypeDetail._();

  factory TypeDetail([void updates(TypeDetailBuilder b)]) = _$TypeDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetail> get serializer => _$TypeDetailSerializer();
}

class _$TypeDetailSerializer implements PrimitiveSerializer<TypeDetail> {
  @override
  final Iterable<Type> types = const [TypeDetail, _$TypeDetail];

  @override
  final String wireName = r'TypeDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'damage_relations';
    yield serializers.serialize(
      object.damageRelations,
      specifiedType: const FullType(TypeRelationships),
    );
    yield r'past_damage_relations';
    yield serializers.serialize(
      object.pastDamageRelations,
      specifiedType: const FullType(BuiltList, [FullType(TypePastRelationships)]),
    );
    yield r'game_indices';
    yield serializers.serialize(
      object.gameIndices,
      specifiedType: const FullType(BuiltList, [FullType(TypeGameIndex)]),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'move_damage_class';
    yield object.moveDamageClass == null ? null : serializers.serialize(
      object.moveDamageClass,
      specifiedType: const FullType.nullable(MoveDamageClassSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(TypeName)]),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(BuiltList, [FullType(TypePokemon)]),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltMap, [FullType(String), FullType(TypeGameSprite)])]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'damage_relations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeRelationships),
          ) as TypeRelationships;
          result.damageRelations.replace(valueDes);
          break;
        case r'past_damage_relations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypePastRelationships)]),
          ) as BuiltList<TypePastRelationships>;
          result.pastDamageRelations.replace(valueDes);
          break;
        case r'game_indices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeGameIndex)]),
          ) as BuiltList<TypeGameIndex>;
          result.gameIndices.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'move_damage_class':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MoveDamageClassSummary),
          ) as MoveDamageClassSummary?;
          if (valueDes == null) continue;
          result.moveDamageClass.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeName)]),
          ) as BuiltList<TypeName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypePokemon)]),
          ) as BuiltList<TypePokemon>;
          result.pokemon.replace(valueDes);
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>;
          result.moves.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltMap, [FullType(String), FullType(TypeGameSprite)])]),
          ) as BuiltMap<String, BuiltMap<String, TypeGameSprite>>;
          result.sprites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


